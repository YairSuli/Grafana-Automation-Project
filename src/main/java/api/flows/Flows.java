package api.flows;

import api.ApiActions;

public class Flows extends BaseFlows {
    public final UsersFlow usersFlow = new UsersFlow(apiActions);

    public Flows(ApiActions ApiActions) {
        super(ApiActions);
    }
}
