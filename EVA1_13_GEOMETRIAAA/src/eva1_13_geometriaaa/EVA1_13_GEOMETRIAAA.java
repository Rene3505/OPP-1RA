
package eva1_13_geometriaaa;


public class EVA1_13_GEOMETRIAAA {


    public static void main(String[] args) {
        System.out.println("Area de cuadrado con lados de 6: "+Geometria.calcularAreaCuadrado(6));
        System.out.println("Area de rectangulo con base de 6 y altura de 9: "+Geometria.calcularAreaRectangulo(6, 9));
        System.out.println("Area de triangulo con base de 4 y altura de 7: "+Geometria.calcularAreaTriangulo(4, 7));
        System.out.println("Perimetro de triangulo con un lado de 2, otro de 4 y otro de 5: "+Geometria.calcularPerimetroTriangulo(2, 4, 5));
        System.out.println("Area de circulo con radio de 11: "+Geometria.calcularAreaCirculo(11));
        System.out.println("Perimetro de circulo con radio de 11: "+Geometria.calcularPermietroCirculo(11));
        System.out.println("Calcular area de rombo con diagonal mayor de 15 y diagonal menor de 8: "+Geometria.calcularAreaRombo(15, 8));
        System.out.println("Calcular area de trapecio con base mayor de 40, base menor de 32 y altura de 30: "+Geometria.calcularAreaTrapecio(40, 32, 30));
    }
    
}
