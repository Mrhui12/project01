/**2020年12月25日 上午8:40:19
 * @author Yang Jiabin
 * @describe 画圣诞树
 *
 */
package cn.itcast.list;
public class ChristmasTree {

    private int height=5;//圣诞树的高
    private char element='$';//圣诞树组成元素
    private int root=1;//树根高

    public static void main(String[] args) {

        ChristmasTree christmasTree=new ChristmasTree();
        christmasTree.drawTree();

    }

    /**构造方法
     * @param height
     * @param element
     */
    public ChristmasTree(int height, char element) {
        super();
        this.height = height;
        this.element = element;
    }

    /**构造方法
     *
     */
    public ChristmasTree() {
        super();
    }

    //return height 访问器
    public int getHeight() {
        return height;
    }

    //@param height 修改器
    public void setHeight(int height) {
        this.height = height;
    }

    //return element 访问器
    public char getElement() {
        return element;
    }

    //@param element 修改器
    public void setElement(char element) {
        this.element = element;
    }

    //画一棵圣诞树
    public void drawTree() {
        int len=height-1;
        int h=1;
        while(len>=0) {
            for(int i=0;i<len;i++) {
                System.out.print(" ");
            }
            for(int i=0;i<h;i++) {
                System.out.print(element);
            }
            System.out.println();
            len--;
            h+=2;
        }
        for(int i=1;i<=root;i++) {
            for(int j=1;j<height;j++) {
                System.out.print(" ");
            }
            System.out.println(element);
        }


    }

}

