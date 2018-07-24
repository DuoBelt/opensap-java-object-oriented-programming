class Story {

    public static void main(String[] args) {
        ReplacementPart screw = new ReplacementPart("screw", "grey", 5);
        System.out.println("screw was created with the attributes description: " + screw.description + ", color: " + screw.color  + ", size: " + screw.size);
        ReplacementPart display = new ReplacementPart("display", "multicolor", 100);
        System.out.println("display was created with the attributes description: " + display.description + ", color: " + display.color  + ", size: " + display.size);
    }

}
