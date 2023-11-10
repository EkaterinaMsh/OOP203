public enum Size {
    XXS(32), XS(34), S(36), M(38), L(40);

    private int euroSize;

    private Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription() {
        return "Взрослый размер";
    }

    @Override
    public String toString() {
        return name() + " (" + euroSize + ")";
    }

    // Переопределение метода getDescription для XXS
    public String getDescriptionForXXS() {
        return "Детский размер";
    }
}
