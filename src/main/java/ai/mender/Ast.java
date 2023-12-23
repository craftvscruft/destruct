package ai.mender;

import com.dslplatform.json.CompiledJson;
import com.dslplatform.json.DslJson;
import com.dslplatform.json.PrettifyOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Optional;

public interface Ast {
    DslJson<Object> JSON = new DslJson<>();

    @CompiledJson
    record Start(List<Rule> rules) implements Ast {

    }
    @CompiledJson
    record Rule(String target, List<Match> match) implements Ast {

    }

    @CompiledJson
    record Match(DestructStep left, Transform right) implements Ast {

    }

    @CompiledJson
    record DestructStep(String msg, List<DestructStep> steps) implements Ast  {
    }

    @CompiledJson
    record TransformStep(String msg, List<TransformStep> steps) implements Ast {
    }

    @CompiledJson
    record Rest(Optional<String> key) implements Ast {

    }

    @CompiledJson
    record Transform(List<TransformStep> steps) implements Ast {
    }
    static String toJson(Object o) {
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            JSON.serialize(o, new PrettifyOutputStream(out));
            return new String(out.toByteArray(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
