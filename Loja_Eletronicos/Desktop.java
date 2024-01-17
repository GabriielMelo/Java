public class Desktop extends ProdutoEletronico{


private String placaDeVideo;


public Desktop(String n,double p,String m,double a, String pc, String pl){
    super(n,p,m,a,pc);
    this.setPlacaDeVideo(pc);
}


public String getPlacaDeVideo() {
    return placaDeVideo;
}


public void setPlacaDeVideo(String placaDeVideo) {
    this.placaDeVideo = placaDeVideo;
}


}
