package fooddelivery;

public class 결제취소됨 extends AbstractEvent {

    private Long id;

    public 결제취소됨(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
