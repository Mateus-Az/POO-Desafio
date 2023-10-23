package desafio;

public class Iphone implements MusicPlayer,Browser{
    public String call(){
        return "init meet";
    }
    public String answer(){
        return "receiving call";
    }
    public String voiceMail(){
        return "you have 6 voice messages";
    }

    @Override
    public String showPage() {
        return "youtube: gatos fofos";
    }

    @Override
    public String newView() {
        return "view 2";
    }

    @Override
    public String updatePage() {
        return "reloading";
    }

    @Override
    public String play() {
        return "playing music";
    }

    @Override
    public String stop() {
        return "";
    }

    @Override
    public String selectMusic() {
        return "select un music";
    }
}
