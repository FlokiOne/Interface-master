public class Main {

    public static void main(String[] args){
        School school = new School();
        Game game = new Game();

        Girl girl = new Girl();
        Boy boy = new Boy();
        Other other = new Other();

        school.start(boy);
        school.start(girl);
        school.start(other);

        game.start(boy);
        game.start(girl);
        game.start(other);
    }

}