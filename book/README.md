# spring-boot thymeleaf view
* HTML, CSS, JS가 적용된 static web HTML 파일에 컨트롤러부터 전달되어 온 데이터를 
기본 모양을 흐트러트리지 않는 범위내에서 자유롭게 표현하는 view이다. 
* jsp 와 비교했을 때 jsp 는 서버를 거쳐서 rendering이 되지 않으면 어떻게 화면이
구성되는 지 그 결과를 알기가 어렵다. 
* 표준 웹브라우저에서 open을 했을 때는 마치 static html처럼 보여지고
  서버에서 데이터가 전달되면 실제 데이터를 포함하여 렌더링한 후 보여지기 때문에 
  개발자와 디자이너가 협업하기에 매우 좋은 view이다. 
  
 * spring-boot WAS에서 거의 표준처럼 사용되는 view이다. 
 
 # data-jpa 프로젝트
 * spring jpa 프로젝트에서 spring.datasource.initialize-mode를 alwalys로 설정한 후 
  src/main/resource 폴더에 data.sql 파일을 생성 한 후 insert sql을 저장해 두면 프로젝트가 재 시작될 때
  data.sql 파일의 sql문을 읽어서 데이터를 자동으로 추가해준다. 
  샘플데이터가 필요할 때 사용하면 좋다 .
 * 또한 src/main/resource 폴더에 schema.sql 파일을 생성한 후 DDL sql 문을 저장해 두면
 프로젝트가 재 시작될 때 DDL SQL 문을 실행할 수 있다.  
 