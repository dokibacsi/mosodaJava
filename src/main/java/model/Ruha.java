package model;

public class Ruha {

    private String tulNev;
    private boolean tisztae;

    public Ruha(String tulNev) {
        this(tulNev, false);
    }

    public Ruha(String tulNev, boolean tisztae) {
        this.tulNev = tulNev;
        this.tisztae = tisztae;
    }

    public String getTulNev() {
        return tulNev;
    }

    public void setTisztae(boolean tisztae) {
        this.tisztae = tisztae;
    }

    public boolean isTisztae() {
        return tisztae;
    }

    @Override
    public String toString() {
        return "Ruha{" +
                "tulNev='" + tulNev + '\'' +
                ", tisztae=" + tisztae +
                '}';
    }
}
