package beans;

import java.util.Map;

public class MapBean {
    private Map<Long, Address> params;

    public MapBean() {
    }

    public MapBean(Map<Long, Address> params) {
        this.params = params;
    }

    public Map<Long, Address> getParams() {
        return params;
    }

    public void setParams(Map<Long, Address> params) {
        this.params = params;
    }

    @Override
    public String toString() {
        return "MapBean{" +
                "params=" + params +
                '}';
    }
}
