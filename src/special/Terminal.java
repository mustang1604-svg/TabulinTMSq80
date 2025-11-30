package special;

import java.io.Serializable;
import java.util.List;

public class Terminal implements Serializable {
    private List<String> parameters;

    public Terminal(List<String> parameters) {
        this.parameters = parameters;

    }

    @Override
    public String toString() {
        return "Terminal{parameters=" + parameters + "}";
    }
}
