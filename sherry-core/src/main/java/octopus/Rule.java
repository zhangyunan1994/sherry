package octopus;

public interface Rule {

  boolean evaluate(GlobalContext globalContext, FlowContext flowContext, Facts facts);

  void execute(GlobalContext globalContext, FlowContext flowContext, Facts facts) throws Exception;

}
