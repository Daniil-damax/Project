

public class controller {

    private Field own;
    private Field rival;
    private View view;

    public controller(Field own, Field rival, View view) {
        this.own = own;
        this.rival = rival;
        this.view = view;
    }

    public void cellClicked(int x, int y) {
        System.out.println("clicked " + x + " " + y);
        int value = rival.getValue(x, y);
        System.out.println(rival.getValue(x, y));
        if(value == Field.EMPTY) {
            rival.setValue(x, y, Field.CROSS);

        } else if(value == Field.) {
            field.setValue(i, j, Field.MINE);

        }
        view.updateView();
    }


}
