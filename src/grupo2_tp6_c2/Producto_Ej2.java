
package grupo2_tp6_c2;


public class Producto_Ej2 implements Comparable<Producto_Ej2>{
    private int codigo2;
    private String descripcion;
    private double precio;
    private int stock;
    private Categoria_Ej2 rubro;

    public Producto_Ej2(int codigo, String descripcion, double precio, int stock, Categoria_Ej2 rubro) {
        this.codigo2 = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
    }

    Producto_Ej2(int i, String azucar_x_1kg, int i0, Categoria_Ej2 categoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCodigo() {
        return codigo2;
    }

    public void setCodigo(int codigo) {
        this.codigo2 = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Categoria_Ej2 getRubro() {
        return rubro;
    }

    public void setRubro(Categoria_Ej2 rubro) {
        this.rubro = rubro;
    }

    @Override
    public String toString() {
        return "Producto:" + "codigo=" + codigo2 + ", descripcion=" + descripcion + ", precio=" + precio + ", stock=" + stock + ", rubro=" + rubro;
    }

    @Override
    public int compareTo(Producto_Ej2 t) {
      if(this.codigo2==t.codigo2){
           return 0;
       }else if(codigo2 > t.codigo2){
           return 1;
       }else{
           return -1;
       }
    }
}
