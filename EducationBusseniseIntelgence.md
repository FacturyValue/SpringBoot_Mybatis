### 教育版BI系统项目开发总结

- 开发周期：4天  共计40个工时
- 开发人员：
  - 负责人：刘庆
  - 前端开发人员：杨
  - 后端开发人员:  rudy
- 项目描述：基于Cboard开源项目，增加公共数据源同步数据并将资源展示在cboard项目中
- 开发任务：
  - 搭建springboot项目，整合Mybatis框架
  - 编写接口用于传输公共资源库数据
    1. /api/table/catagory
    2. /api/table/listInfo/{name}

- 开发问题：
  1. 如何搭建springboot整合Mybatis框架
  2. 如何利用原生JDBC操作自定义数据源以及对数据解析
  3. Mybatis框架在springboot中的使用步骤和基本配置
  4. fastjson传递数据，对返回数据自定义校验，如日期的格式，继承HttpMessageConvertSupport类并且对null值的过滤。
  5. 返回接口数据使用ServiceResult返回数据，定义 返回状态码、信息内容、json字符串