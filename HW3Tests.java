/**
 * HW3Tests contains five automated test cases for the HW3 assignment.
 * Each test verifies a specific functionality based on the team’s TP2 submission.
 *
 * <p>Test cases include:
 * <ul>
 *   <li>testCreateQuestion: Verifies that a question can be created.</li>
 *   <li>testUpdateQuestion: Verifies that an existing question is updated correctly.</li>
 *   <li>testDeleteQuestion: Verifies that a question is deleted successfully.</li>
 *   <li>testCreateAnswer: Verifies that an answer can be created for a question.</li>
 *   <li>testUpdateAnswer: Verifies that an answer is updated correctly.</li>
 * </ul>
 * </p>
 *
 * @version 1.0
 */
public class HW3Tests {

    /**
     * Main method to run all automated tests.
     * Each test prints the result to the console.
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        testCreateQuestion();
        testUpdateQuestion();
        testDeleteQuestion();
        testCreateAnswer();
        testUpdateAnswer();
    }

    /**
     * Test to verify that a question is created successfully.
     * Expects that the creation method returns a valid question ID (> 0).
     */
    public static void testCreateQuestion() {
        int questionId = DatabaseHelper.createQuestion("What is JavaFX?", "testUser");
        if (questionId > 0) {
            System.out.println("testCreateQuestion passed. Question ID: " + questionId);
        } else {
            System.out.println("testCreateQuestion failed.");
        }
    }

    /**
     * Test to verify that an existing question is updated correctly.
     * Expects that the update operation returns true.
     */
    public static void testUpdateQuestion() {
        boolean result = DatabaseHelper.updateQuestion(101, "Updated JavaFX Question", "testUser", "user");
        if (result) {
            System.out.println("testUpdateQuestion passed.");
        } else {
            System.out.println("testUpdateQuestion failed.");
        }
    }

    /**
     * Test to verify that a question is deleted successfully.
     * Expects that the deletion operation returns true.
     */
    public static void testDeleteQuestion() {
        boolean result = DatabaseHelper.deleteQuestion(101, "testUser", "user");
        if (result) {
            System.out.println("testDeleteQuestion passed.");
        } else {
            System.out.println("testDeleteQuestion failed.");
        }
    }

    /**
     * Test to verify that an answer is created successfully.
     * Expects that the creation method returns a valid answer ID (> 0).
     */
    public static void testCreateAnswer() {
        int answerId = DatabaseHelper.createAnswer(101, "JavaFX is a Java GUI framework.", "testUser");
        if (answerId > 0) {
            System.out.println("testCreateAnswer passed. Answer ID: " + answerId);
        } else {
            System.out.println("testCreateAnswer failed.");
        }
    }

    /**
     * Test to verify that an existing answer is updated correctly.
     * Expects that the update operation returns true.
     */
    public static void testUpdateAnswer() {
        boolean result = DatabaseHelper.updateAnswer(201, "Updated JavaFX answer.", "testUser", "user");
        if (result) {
            System.out.println("testUpdateAnswer passed.");
        } else {
            System.out.println("testUpdateAnswer failed.");
        }
    }
}
