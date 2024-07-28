import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.CsvFileSource;

import sumterm.testing.ScreenCV.CVScreening;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CVScreenTesting {
    /*
     * Testcase kiểm thử hộp đen
     */
    @ParameterizedTest
    @CsvFileSource(resources = "/blackBoxTesting/boundaryTesting.csv", numLinesToSkip = 1)
    public void testBoundaryTesting(double testID, String entryTestRes, double gpa, String expected) {
        assertEquals(expected, CVScreening.screenCV(gpa, entryTestRes));
    }

    /*
     * Testcase kiểm thử bảng quyết định
     */
    @ParameterizedTest
    @CsvFileSource(resources = "/blackBoxTesting/decisionTableTesting.csv", numLinesToSkip = 1)
    public void testDecisionTableTesting(double testId, String entryTestRes, double gpa, String expected) {
        assertEquals(expected, CVScreening.screenCV(gpa, entryTestRes));
    }

    /*
     * Testcase kiểm thử dòng điều khiển
     */
    @ParameterizedTest
    @CsvFileSource(resources = "/controlFlowTesting/controlFlowTesting.csv", numLinesToSkip = 1)
    public void testCFGTesting(double testId, String entryTestRes, double gpa, String expected) {
        assertEquals(expected, CVScreening.screenCV(gpa, entryTestRes));
    }

    /*
     * Testcase dòng dữ liệu
     */
    @ParameterizedTest
    @CsvFileSource(resources = "/dataFlowTesting/dataFlowTesting.csv", numLinesToSkip = 1)
    public void testDataFlowTesting(double testId, String entryTestRes, double gpa, String expected) {
        assertEquals(expected, CVScreening.screenCV(gpa, entryTestRes));
    }
}
