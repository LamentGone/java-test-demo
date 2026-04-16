# java-test-demo

Java 单元测试与测试管理实验示例项目。

## 项目目标

本项目用于满足测试管理实验中的以下要求：

- 使用 Git 仓库管理源代码
- 使用 Maven 完成 `build` 与 `test` 任务配置
- 使用持续集成工具执行冒烟测试
- 配合 issue tracking 工具登记发现的缺陷

## 环境建议

- 代码仓库：GitHub / Gitee / 本地 GitLab
- 持续集成：GitHub Actions 或 Jenkins
- 缺陷跟踪：GitHub Issues / Gitee Issues / Jira / MantisBT
- JDK：8 或以上
- Maven：3.8+ 

## Maven 任务

### 1. 执行测试

```bash
mvn test
```

说明：

- 运行全部单元测试
- 控制台可看到测试执行提示
- 适合作为日常回归测试

### 2. 导出完整 jar 包

```bash
mvn clean package
```

说明：

- 生成可执行 jar 包到 `target/`
- 默认在打包前先执行测试

### 3. 仅执行冒烟测试

```bash
mvn -Dtest=CalculatorSmokeTest test
```

说明：

- 用于持续集成中的快速验证
- Jenkins 或 GitHub Actions 日志中可直接看到 `[SMOKE]` 输出

## 持续集成配置

项目已提供 GitHub Actions 示例：

- 路径：`.github/workflows/ci.yml`
- 作用：推送代码后自动执行冒烟测试，并构建 jar 包

若你使用 Jenkins，可配置如下构建步骤：

```bash
mvn -Dtest=CalculatorSmokeTest test
```

如需继续执行完整构建，可追加：

```bash
mvn clean package -DskipTests
```

## 缺陷登记建议模板

你可以在 GitHub Issues、Gitee Issues、Jira 或 MantisBT 中按以下格式登记缺陷：

- 缺陷编号：BUG-20260416-001
- 缺陷标题：乘法结果计算错误导致冒烟测试失败
- 发现版本：v1.0.0
- 提交人：162330207袁彬怡
- 严重级别：高 / 中 / 低
- 优先级：P1 / P2 / P3
- 所属模块：Calculator
- 环境信息：Windows 10 + JDK 8 + Maven 3.9.x
- 前置条件：项目已成功构建
- 复现步骤：
  1. 执行 `mvn test`
  2. 观察 `Calculator` 相关测试结果
- 预期结果：乘法与除法逻辑正确，测试全部通过
- 实际结果：某测试失败或输出异常
- 附件：失败日志、截图、提交记录

- 缺陷登记截图
- jar 包生成结果截图
