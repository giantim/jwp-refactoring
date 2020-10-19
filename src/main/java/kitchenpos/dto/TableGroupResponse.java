package kitchenpos.dto;

public class TableGroupResponse {
    private Long id;

    private TableGroupResponse() {
    }

    public TableGroupResponse(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
