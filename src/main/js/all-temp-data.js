import jQuery from "jquery";

const $ = jQuery;

export function all_data(all_temp,err) {
  $.ajax({
    url:"/api/v1/temp/",
    type:"GET",
    dataType:"json"
  }).done((result)=>{
    for(let i  of result){
      all_temp.append(`<tr>
                        <td>${i["no"]}</td>
                        <td>${i["datetime"]}</td>
                        <td>${i["temp"]}</td>
                        <td>
                          <button date-deleteid=${i["id"]} type="button" class="btn btn-danger delete-temp">削除</button>
                        </td>
                      </tr>`);
    }
  }).fail(()=>{
    err.html(`
      <div class="alert alert-danger" role="alert">
        <strong>読み込み失敗</strong> サーバに接続できません
      </div>`)
  })
}
