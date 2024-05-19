import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private List<Comments> comments = new ArrayList<>();

    public Post() {
    }

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comments> getComents() {
        return comments;
    }

    public void addComment(Comments comment) {
        comments.add(comment);
    }

    public void removeComment(Comments comment) {
        comments.remove(comment);
    }

    public String toString(){
        // return this.getTitle() + "\n" + this.getLikes() + " - " + this.getMoment() + "\n" + "Comments:\n" + this.getComents();
        // String Builder :
        StringBuilder sb = new StringBuilder();
        sb.append(title+"\n");
        sb.append(likes + " Likes - " );
        sb.append(sdf.format(moment)+"\n");
        sb.append(content+"\n"+"Comments:\n");
        for(Comments c : comments){
            sb.append(c.getText()+"\n");
        }
        return sb.toString();

    }

}
