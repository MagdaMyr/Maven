package structures.clinic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ClinicTest {

    @Test
    void shouldHandlePatient() {
        //given
        Clinic clinic = new Clinic();
        clinic.registerPatient("Monika");
        clinic.registerPatient("Beata");
        clinic.registerPatient("Michał");

        //when
        String result = clinic.handlePatient();

        //then
        assertThat(result).isEqualTo("Monika");
    }

}