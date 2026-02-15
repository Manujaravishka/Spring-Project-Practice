const API_BASE = 'http://localhost:8080/api/v1/customer';

function getFormData() {
    return {
        cId: $('#cId').val().trim(),
        cName: $('#cName').val().trim(),
        cAddress: $('#cAddress').val().trim()
    };
}

function clearForm() {
    $('#cId').val('');
    $('#cName').val('');
    $('#cAddress').val('');
}

function showMessage(message, isError) {
    alert(message);
}

function saveCustomer() {
    const data = getFormData();
    if (!data.cId || !data.cName || !data.cAddress) {
        showMessage('Please fill all fields.', true);
        return;
    }
    $.ajax({
        url: API_BASE,
        method: 'POST',
        contentType: 'application/json',
        data: JSON.stringify(data),
        success: function () {
            showMessage('Customer saved successfully.');
            clearForm();
        },
        error: function (xhr) {
            showMessage('Save failed: ' + (xhr.responseText || xhr.status), true);
        }
    });
}

function updateCustomer() {
    const data = getFormData();
    if (!data.cId || !data.cName || !data.cAddress) {
        showMessage('Please fill all fields.', true);
        return;
    }
    $.ajax({
        url: API_BASE,
        method: 'PUT',
        contentType: 'application/json',
        data: JSON.stringify(data),
        success: function () {
            showMessage('Customer updated successfully.');
            clearForm();
        },
        error: function (xhr) {
            showMessage('Update failed: ' + (xhr.responseText || xhr.status), true);
        }
    });
}

function deleteCustomer() {
    const cId = $('#cId').val().trim();
    if (!cId) {
        showMessage('Enter Customer ID to delete.', true);
        return;
    }
    if (!confirm('Delete this customer?')) return;
    $.ajax({
        url: API_BASE + '/' + cId,
        method: 'DELETE',
        success: function () {
            showMessage('Customer deleted successfully.');
            clearForm();
        },
        error: function (xhr) {
            showMessage('Delete failed: ' + xhr.status, true);
        }
    });
}

$(function () {
    $('.save').on('click', saveCustomer);
    $('.update').on('click', updateCustomer);
    $('.delete').on('click', deleteCustomer);
});
