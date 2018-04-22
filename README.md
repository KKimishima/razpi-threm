# razpi-threm
ラズベリーパイからjsonの温度データを受け取り表示する
===

## リリース
- ver0.1
restでDB接続と仮トップ画面表示
- ver0.6
メインページの作製とapiからデータを取り、表示デキるように作製
- ver0.8
 herokuデプロイテスト

## rest
- 登録データ全件教示
```
curl http://server/api/v1/temp
```

- 一件登録
```
curl -XPOST -H "Content-Type:application/json" http://server/api/v1/temp -d '{"no":99,"datetime":"2020-01-01 00:00:01","temp":"99.0"}'
```

- 最後の登録表示
```
curl http://server/api/v1/temp/last
```