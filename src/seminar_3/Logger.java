package seminar_3;

public class Logger {
    private static final Logger INSTANCE = new Logger();

    private Logger() {
    }

    public static Logger getInstance() {
        return INSTANCE;
    }
    //дальше пойдут методы логгера отвечающие за, собственно, логирование
}
