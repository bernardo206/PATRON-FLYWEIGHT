public class FlyweightFactory {

    private Arbol ornamental;
    private Arbol frutal;
    private Arbol floral;


    public Arbol buildArbol(String tipo){
        if (tipo.equalsIgnoreCase("ornamental")){
            if (this.ornamental == null){
                this.ornamental = new Arbol();
                this.ornamental.setAlto(200);
                this.ornamental.setHorizontal(400);
                this.ornamental.setColor("verde");
            }
            return this.ornamental;
        } else if (tipo.equalsIgnoreCase("frutal")) {
            if (this.frutal == null){
                this.frutal = new Arbol();
                this.frutal.setAlto(500);
                this.frutal.setHorizontal(300);
                this.frutal.setColor("rojo");
            }
            return this.frutal;
        } else if (tipo.equalsIgnoreCase("floral")) {
            if (this.floral == null){
                this.floral = new Arbol();
                this.floral.setAlto(100);
                this.floral.setHorizontal(200);
                this.floral.setColor("celeste");
            }
            return this.floral;
        }else{
            return null;
        }
    }
}
