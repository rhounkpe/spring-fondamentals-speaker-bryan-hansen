import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        // SpeakerService speakerService = new SpeakerServiceImpl();

        SpeakerService speakerService = context.getBean("speakerService", SpeakerService.class);

        // System.out.println(speakerService);
        System.out.println(speakerService.findAll().get(0).getFirstName());
        System.out.println(speakerService.findAll().get(0).getSeedNum());

        // SpeakerService speakerService2 = context.getBean("speakerService", SpeakerService.class);

        // System.out.println(speakerService2);
    }
}
