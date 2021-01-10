package api.flows;

import api.ApiActions;

public abstract class BaseFlows {
    protected final ApiActions apiActions;

    protected BaseFlows(ApiActions apiActions) {
        this.apiActions = apiActions;
    }
}
