package Project11.GridWriterExpanded;

public class GridWriter {

  protected GridItem items[];
  protected int size;
  protected int rows;
  protected int columns;
  protected static final int INITIAL_CAPACITY = 4;

  public GridWriter(int r, int c) {
    items = new GridItem[INITIAL_CAPACITY];
    size = 0;
    rows = r;
    columns = c;
  }

  public int size() {
    return size;
  }

  public GridItem get(int index) {
    try {
      if (index < 0 || index >= size) {
        throw new IndexOutOfBoundsException("Index out of bounds. Please enter a valid input.");
      // } else if (get(index) == null) {
      //   throw new IndexOutOfBoundsException("There is no item at this index. Please enter a valid input.");
      } else {
        return items[index];
      }
    } catch (IndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
      return null;
    }
  }

  /****
   * The GridWriter is a collection style class. It stores GridItems, and
   * prints out a display grid. The add method provides a way to put
   * GridItems into the GridWriter.
   ***/

  public void add(GridItem item) {

    // If the item array is full, we double its capacity
    if (size == items.length) {
      doubleItemCapacity();
    }

    // Store the item GridItem in the items array
    items[size] = item;

    // Increment size. Size counts the number of items
    // currently stored in the GridWriter.
    size++;
  }

  /****
   * The display method prints a grid into standard output. The size of
   * the grid is determined by the row and column values passed into the
   * constructor
   ***/

  public void display() {
    int count;

    // Loop through all rows
    for (int r = rows; r >= 0; r--) {

      // Loop through all columns
      for (int c = 0; c <= columns; c++) {

        // Count the number of GridItems that cover this coordinate
        count = 0;

        for (int i = 0; i < size; i++) {
          if (items[i].containsPoint(c, r)) {
            count++;
          }
        }

        // Print the count in the coordinate location. Or a dot if the count is 0
        if (count == 0) {
          System.out.print(" .");
        } else {
          System.out.print(" " + count);
        }
      }

      // New line at the end of each row
      System.out.println();
    }
  }

  /****
   * This is a private helper method that doubles the array capacity
   * of the grid writer. This allows it to accomodate a dynamic number
   * of grid item objects
   **/
  private void doubleItemCapacity() {

    // allocate a new array with double capacity
    GridItem temp[] = new GridItem[items.length * 2];

    // Copy by hand, so to speak
    for (int i = 0; i < items.length; i++) {
      temp[i] = items[i];
    }

    // point the items array at the temp array.
    // The old array will be garbage collected
    items = temp;
  }
}
