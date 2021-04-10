package response;
import model.User;

import java.util.List;

public class getPendingMatchesResponse {

    private List<User> pendingMatches;
    private boolean hasMorePages;

    public getPendingMatchesResponse() {}

    public getPendingMatchesResponse(List<User> pendingMatches, boolean hasMorePages) {
        this.pendingMatches = pendingMatches;
        this.hasMorePages = hasMorePages;
    }

    public List<User> getPendingMatches() {
        return pendingMatches;
    }

    public void setPendingMatches(List<User> pendingMatches) {
        this.pendingMatches = pendingMatches;
    }

    public boolean getHasMorePages() {
        return hasMorePages;
    }

    public void setHasMorePages(boolean hasMorePages) {
        this.hasMorePages = hasMorePages;
    }
}
