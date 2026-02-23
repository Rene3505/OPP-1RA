
package eva1_13_geometriaaa;

public class Geometria {
    
    public static double calcularAreaCuadrado(double lado){
    double area;
    area = lado*2;
    return area;
    }
    
    public static double calcularPerimetroRectangulo(double base, double altura){
    double perimetro;
    perimetro = (base*2)+(2*altura);
    return perimetro;
    }
    
    public static double calcularAreaRectangulo(double base, double altura){
    double resultado;
    resultado = base*altura; 
    return resultado;
    }
    
    public static double calcularAreaTriangulo(double base, double altura){
    double area;
    area = (base*altura)/2;
    return area;
    }
    
    public static double calcularPerimetroTriangulo(double lado1, double lado2, double lado3){
    double perimetro;
    perimetro = lado1+lado2+lado3;
    return perimetro;
    }
    
    public static double calcularAreaCirculo(double radio){
    double area;
    area = (radio*radio)*Math.PI;
    return area;
    }
    
    public static double calcularPermietroCirculo(double radio){
    double perimetro;
    perimetro = 2*Math.PI*radio;
    return perimetro;
    }
    
    public static double calcularAreaRombo(double diagonalMay, double diagonalMen){
    double area;
    area = (diagonalMay*diagonalMen)/2;
    return area;
    }
    
    public static double calcularAreaTrapecio(double baseMay, double baseMen, double altura){
    double area;
    area = ((baseMay+baseMen)*altura)/2;
    return area;
    }
    
}
