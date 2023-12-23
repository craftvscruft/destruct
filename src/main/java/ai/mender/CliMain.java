package ai.mender;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import java.io.File;
import java.util.concurrent.Callable;

@Command(name = "parse", mixinStandardHelpOptions = true, version = "0.0.0", description = "")
class CliMain implements Callable<Integer> {

    @Parameters(index = "0", description = "Expression to parse", defaultValue = "")
    private String expr;

    @Option(names = {"-f", "--file"}, description = "file to parse")
    private File file;

    @Override
    public Integer call() throws Exception {
        System.out.println(Ast.toJson(Harness.parseStringToAst(expr)));
        return 0;
    }

    public static void main(String... args) {
        int exitCode = new CommandLine(new CliMain()).execute(args);
        System.exit(exitCode);
    }
}