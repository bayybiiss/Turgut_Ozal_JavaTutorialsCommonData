package finalhome.webprogramming;
import java.util.List;
public abstract class IJqueryService {
    // MODEL MAPPER
    public JqueryDto EntityToDto(JqueryEntity jqueryEntity) {
        return null;
    }

    public JqueryEntity DtoToEntity(JqueryDto jqueryDto) {
        return null;
    }

    // CREATE
    public JqueryDto createRegister(JqueryDto jqueryDto) {
        return null;
    }

    // LIST
    public abstract List<JqueryDto> getAllRegisters();
}
