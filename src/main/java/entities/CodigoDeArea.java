package entities;

public enum CodigoDeArea {
    DDD11("11"),
    DDD12("12"),
    DDD13("13"),
    DDD14("14"),
    DDD15("15"),
    DDD16("16"),
    DDD17("17"),
    DDD18("18"),
    DDD19("19");

    private String codigo;

    private CodigoDeArea(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public static boolean isValid(String codigo) {
        for (CodigoDeArea ddd : values()) {
            if (ddd.getCodigo().equals(codigo)) {
                return true;
            }
        }
        return false;
    }
}
