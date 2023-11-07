package uz.pcmarket.online.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OrderDto {
    private Long userId;

    private List<Long> orderDetailsIds;

}
