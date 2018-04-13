module.exports = {
  // モード値を production に設定すると最適化された状態で、
  // development に設定するとソースマップ有効でJSファイルが出力される
  mode: 'development',

  // メインとなるJavaScriptファイル（エントリーポイント）
  entry: `./src/main/js/index.js`,

  // ファイルの出力設定
  output: {
    // 出力ファイル名
    filename: 'main.js',
    // path: __dirname + 'src/main/resources/static/js'
    path: __dirname + '/src/main/resources/static/js'

  },
  devServer: {
    contentBase: 'dist',
    open: true,
    port: 3003
  },
  module: {
    rules: [
      { test: /\.css$/, use: ['style-loader', 'css-loader'] },
      {
        // 拡張子 .js の場合
        test: /\.js$/,
        use: [
          {
            // Babel を利用する
            loader: 'babel-loader',
            // Babel のオプションを指定する
            options: {
              presets: [
                // env を指定することで、ES2017 を ES5 に変換。
                // {modules: false}にしないと import 文が Babel によって CommonJS に変換され、
                // webpack の Tree Shaking 機能が使えない
                ['env', { 'modules': false }]
              ]
            }
          }
        ]
      }
    ],
    // node_modules は除外する
    // exclude: /node_modules/,
  }
};