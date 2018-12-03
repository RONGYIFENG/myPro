public class entity {
    //@Length(max=32)
    /** 主键 */
    private String id;
    /** 标题 */
    private String title;

    //@NotNull
    /** 类型 */
    private Integer type;

    //@Length(max=0)
    /** 作者 */
    private String author;

    //@NotBlank @Length(max=2500)
    /** 内容 */
    @Person(age = 20,name = "s")
    private String content;

    //@NotNull
    /** 发布时间 */
    private Long createTime;

    //@Length(max=0)
    /** 图片 */
    private String img;

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // start-处理日期参数查询条件
    // end-处理日期参数查询条件
}
