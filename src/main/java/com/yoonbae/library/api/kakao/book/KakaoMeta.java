package com.yoonbae.library.api.kakao.book;

import lombok.Data;

@Data
public class KakaoMeta {
    private Boolean is_end;
    private Integer pageable_count;
    private Integer total_count;
}
