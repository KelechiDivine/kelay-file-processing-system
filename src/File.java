import java.util.ArrayList;

public class File {

    private final int id;
    private static IdGenerator idGenerator;
    private final ArrayList<Page> pages;

    public File() {
        id = IdGenerator.generate();
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

    public void addPage(Page page) {
        pages.add(page);
    }

    public int getNumberOfPages() {
        return pages.size();
    }

    public boolean hasPage(Page page) {
        return pages.contains(page);
    }
}
