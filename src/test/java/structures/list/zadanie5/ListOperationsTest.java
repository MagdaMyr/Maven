package structures.list.zadanie5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ListOperationsTest {

    @Test
    void shouldRemoveDuplicates() {
        //given
        List<String> list = Arrays.asList("Poniedziałek", "Poniedziałek", "Czwartek",
                "Wtorek", "Środa", "Czwartek", "Poniedziałek");
        //when
        List<String> result = ListOperations.removeDuplicates(list);
        //then
        assertThat(result).containsExactly("Poniedziałek", "Czwartek", "Wtorek", "Środa");
    }

    @Test
    void shouldReturnEmptyListForEmptyList() {
        //given
        List<String> list = Arrays.asList();
        //when
        List<String> result = ListOperations.removeDuplicates(list);
        //then
        assertThat(result).isEmpty();
    }

}