function eliminar (id){
swal({
  title: "Estas seguro de eliminar el registro?",
  text: "Eliminara el registro y no podra recuperarlo!",
  icon: "warning",
  buttons: true,
  dangerMode: true,
})
.then((OK) => {
  if (OK) {
  $.ajax({
  		url:"/eliminar/"+id,
  		succes: function(res){
  			console.long(res);
  		},
  });
    swal("Elimino correctamente el registro!", {
      icon: "success",
    }).then((ok)=>{
    if(ok){
    	location.href="/listar";
    }
    
  });
  } else {
    swal("No se guardo ningun cambio!");
  }
});


}