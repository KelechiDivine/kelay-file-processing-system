import java.util.ArrayList;

public class File {

    private final int id;
    private static IdGenerator idGenerator;
    private final ArrayList<Page> pages;

    public File() {
        id = IdGenerator.getId();
        pages = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public ArrayList<Page> getPages() {
        return pages;
    }

    public void removePage(int pageNumber) {
        Page pageToRemove = new Page();
        for(Page page : pages) {
            if(page.getNumber() == pageNumber) {
                pageToRemove = page;
            }
        }
        pages.remove(pageToRemove);
    }
}
