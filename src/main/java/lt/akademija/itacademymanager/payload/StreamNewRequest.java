package lt.akademija.itacademymanager.payload;

import lombok.Data;
import lt.akademija.itacademymanager.model.Stream;

import javax.validation.constraints.Size;

@Data
public class StreamNewRequest {


    @Size(min = 2, max = 30, message = "Stream name must be between 2 and 30 characters")
    private String name;

    public Stream toStream() {
        return new Stream(name);
    }
}
