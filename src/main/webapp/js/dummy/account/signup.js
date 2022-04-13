$(() => {
    $("#form_signup").submit(function (e) {
        e.preventDefault();

        const formdata = new FormData(this);

        $.ajax({
            type: "post",
            url: "/dummy/account/signup",
            data: formdata,
            cache: false,
            contentType: false,
            processData: false,
        }).done((res) => {

        }).fail((error) => {

        })
    });
})