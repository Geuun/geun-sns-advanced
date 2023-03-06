# Geun - SNS - Advanced

![guen SNS](https://user-images.githubusercontent.com/89567475/211623115-bbe83231-7d49-443a-8866-43ec57000a3f.png)

## 📝 Summery

> [SNS 프로젝트](https://github.com/Geuun/Geun-SNS) 고도화 프로젝트입니다.

### 개선해야 할 점

1. GitHub Actions를 이용한 CI/CD or Jenkins를 이용한 CI/CD 구축

```text
기존 프로젝트에서 GitLab CI/CD + Crontab을 이용한 배포를 진행했으나,
Crontab은 지속적으로 서버의 리소스를 사용하기 때문에 해당 부분을 개선해야 합니다.
```

2. Frontend 추가

```text
기존 프로젝트에서는 Backend만 구현했기 때문에 Frontend를 추가해야 합니다.
Frontend는 React를 이용하여 구현할 예정입니다.
```

아직 고려 중인 내용

- [ ] Frontend와 Backend를 분리할 것인지
- [ ] Frontend와 Backend를 분리할 경우, Frontend는 어떤 방식으로 배포할 것인지

3. SSE를 이용한 실시간 알림 기능 구현
```text
기존의 알림기능은 새로고침을 해야만 알림을 확인할 수 있었기 때문에
SSE를 이용하여 실시간 알림을 확인할 수 있도록 개선해야 합니다.
Kafka를 학습하면서 해당 기능을 추가할 예정입니다.
```
