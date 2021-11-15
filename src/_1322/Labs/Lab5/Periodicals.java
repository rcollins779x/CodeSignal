//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Labs.Lab5;

class Periodicals extends Item {
    private int issueNum;

    Periodicals() {
        issueNum = 0;
    }

    Periodicals(String title, int issueNum) {
        super(title);
        setIssueNum(issueNum);
    }

    void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }

    int getIssueNum() {
        return issueNum;
    }

    @Override
    String getListing() {
        return "Periodical Title: " + getTitle() + "\nIssue #: " + getIssueNum();
    }

    @Override
    public String toString() {
        return getTitle() + " " + issueNum;
    }
}
