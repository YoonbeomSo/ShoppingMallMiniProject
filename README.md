# ShoppingMall ToyProject<br/>
SpringLegacyProject 연습<br/>
<br/>
-개요-<br/>
SpringLegacyProject를 통해 Spring MVC 패턴을 익히는 것을 목적으로 진행.<br/>
DB : Oracle 11<br/>
ojdbc8 / mybatis(3.5.9) 사용 <br/>
API : javax.mail(1.4.7)


<br/>
-실행 전 유의 사항-<br/>
ServletConfig.java 의 45행 resolver.setUploadTemDir() 파일 경로를 설정해줘야 작동 됨.<br/>
RootConfig.java 의 mailSender() 의 UserName 및 UserPassword 설정 및 해당 계정의 권한 설정이 필요함. -> email찾기 기능 사용 시<br/>
<br/>
개발 내용 PDF : https://drive.google.com/file/d/1IkwheieZEs-XVyGtwu92vyDbi3PNASrr/view?usp=sharing
