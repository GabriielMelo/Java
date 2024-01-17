import java.util.Random;

public class Smartphone extends ProdutoEletronico implements Recarregavel{
    
    private int resolucaoCamera;
    

    public Smartphone(String n,double p,String m,double a, String pc,int rc){
        super(n,p,m,a,pc);
        this.setResolucaoCamera(rc);
    }


    public int getResolucaoCamera() {
        return resolucaoCamera;
    }

    public void setResolucaoCamera(int resolucaoCamera) {
        this.resolucaoCamera = resolucaoCamera;
    }
    @Override
    public void recarregar() {
        Random rc = new Random();
        int bateria = rc.nextInt(1,100);
        System.out.println("Recarregando... \nBateria:" + bateria);
    }

    
}
