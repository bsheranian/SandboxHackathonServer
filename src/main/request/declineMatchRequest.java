package request;

public class declineMatchRequest {
    private String studentId;
    private String mentorId;

    public declineMatchRequest() {}

    public declineMatchRequest(String studentId, String mentorId) {
        this.studentId = studentId;
        this.mentorId = mentorId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMentorId() {
        return mentorId;
    }

    public void setMentorId(String mentorId) {
        this.mentorId = mentorId;
    }
}
