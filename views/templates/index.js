var templates = require('../../lib/templates.json');
var view = require('../../lib/view');
var App = require('../../lib/app');

module.exports = view.extend({
    id: 'templates',
    template: require('./index.html'),
    data: {
        title: 'Make',
        templates: templates
    },
    methods: {
        onClick: function (e) {
            var self = this;
            var id = e.currentTarget.getAttribute('data-id');
            if (id === 'blank') {
                e.preventDefault();
                var app = App.createApp({template: id});
                self.$root.$data.enteredEditorFrom = '/templates';
                self.page('/make/' + app.id + '/edit');
            }
        }
    }
});
