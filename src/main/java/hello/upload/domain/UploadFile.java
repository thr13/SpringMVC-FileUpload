package hello.upload.domain;

import lombok.Data;

@Data
public class UploadFile {

    private String uploadFileName; // 고객이 업로드한 파일명
    private String storeFileName; // 서버 내부에서 관리하는 파일명

    /*
    고객이 업로드한 파일명으로 서버 내부에 파일을 저장하면 안된다!!
    왜냐하면 서로 다른 고객이 같은 파일명으로 업로드 할 경우, 기존 파일명과 충돌이 발생할 수 있기 때문이다
    그러므로 서버에서는 저장할 파일명이 겹치지 않도록 내부에서 관리하는 별도의 파일명이 필요하다
     */

    public UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }
}
