package com.yaypay.task;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@Execution(ExecutionMode.CONCURRENT)
public class FindIndexTest {

    private final FindIndex findIndex = new FindIndex();

    /**
     * Form of test data: array, element to be found, index of found element
     *
     * @return provided data
     */
    private static Stream<Arguments> providedData() {
        return Stream.of(
                Arguments.arguments(new int[]{5, 6, 1, 2, 3, 4}, 1, 2),
                Arguments.arguments(new int[]{12, 16, 1, 8, 9, 10}, 8, 3),
                Arguments.arguments(new int[]{11, 15, -5, 8, 8, 0}, 7, -1),
                Arguments.arguments(
                        Stream.iterate(0, i -> i + 5).limit(1_000_100).mapToInt(Integer::intValue).toArray(),
                        50_000, 10_000)
        );
    }

    @ParameterizedTest
    @MethodSource("providedData")
    public void testGet(int[] arr, int findingElement, int expectedIndex) {
        assertEquals(findIndex.findElem(arr, findingElement), expectedIndex);
    }
}